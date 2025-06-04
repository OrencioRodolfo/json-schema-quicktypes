import { Message } from "./contract/nodejs/Models";


const message: Message = {
  greeting: "Welcome to quicktype!",
  instructions: [
    "Type or paste JSON here",
    "Or choose a sample above",
    "quicktype will generate code in your",
    "chosen language to parse the sample data"
  ],
  a: {
    "b": 1,
    "c": 2,
  }
}