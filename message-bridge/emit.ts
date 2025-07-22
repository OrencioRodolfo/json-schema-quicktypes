import { Kind, Origin, PSEventsPerfornalDetailsUpdatedEvent, PSEventsPerfornalDetailsUpdatedEventType, PSEventsWalletUpdatedEvent } from '../dist/typescript/PokerStarsEvents';

type Message = PSEventsPerfornalDetailsUpdatedEvent | PSEventsWalletUpdatedEvent;


const event: PSEventsPerfornalDetailsUpdatedEvent = {
    kind: Kind.Event,
    type: PSEventsPerfornalDetailsUpdatedEventType.PokerstarsPersonalDetailsUpdated,
    payload: {
        language: {
            old: "en",
            new: "pt",
        }
    },
    meta: {
        origin: Origin.Pokerstars
    }
};

console.log(event);


type NativeBridge = {
  postMessage: (message: unknown) => void;
};

function isIOSBridgeAvailable(): boolean {
  return !!(window.webkit?.messageHandlers?.native?.postMessage);
}

function isAndroidBridgeAvailable(): boolean {
  return !!(window.Native?.postMessage);
}

function getBridge(): NativeBridge | null {
  if (isIOSBridgeAvailable()) {
    return {
      postMessage: window.webkit.messageHandlers.native,
    };
  }
  
  if (isAndroidBridgeAvailable()) {
    return {
      postMessage: window.Native,
    };
  }
  
  return {
    postMessage: console.log,
  };
  // return null;
}

export const WebBridge = {
  send(message: Message): void {
    const bridge = getBridge();
    if (!bridge) {
      console.warn('Native bridge not available, message not sent:', message);
      return;
    }

    try {
      bridge.postMessage(message);
    } catch (error) {
      console.error('Failed to send message to native bridge:', error);
    }
  },

  listen(handler: (message: Message) => void): void {
    window.addEventListener('message', (event) => {
      try {
        const data = event.data;
        handler(data as Message);
      } catch (err) {
        console.warn('Invalid message received:', err);
      }
    });
  }
};
