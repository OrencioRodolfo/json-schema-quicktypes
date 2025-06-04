

# Wallet Update Event

<p>Triggered when the wallet balance updates</p>

<table>
<tbody>
<tr><th>$id</th><td>walletupdate.schema.json</td></tr>
<tr><th>$schema</th><td>http://json-schema.org/draft-07/schema#</td></tr>
</tbody>
</table>

## Properties

<table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#type">type</a></td><td>undefined=@@sports/wallet_update</td></tr><tr><td colspan="2"><a href="#payload">payload</a></td><td>Object</td></tr></tbody></table>



<hr />


## type


<table class="jssd-property-table">
  <tbody>
    
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    <tr>
      <th>Const</th>
      <td colspan="2">@@sports/wallet_update</td>
    </tr>
  </tbody>
</table>




## payload


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Object</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>

### Properties
  <table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#payloadamount">amount</a></td><td>Number</td></tr><tr><td colspan="2"><a href="#payloadcurrency">currency</a></td><td>String</td></tr></tbody></table>


### payload.amount


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>




### payload.currency


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">String</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>










<hr />

## Schema
```
{
    "$schema": "http://json-schema.org/draft-07/schema#",
    "$id": "walletupdate.schema.json",
    "title": "Wallet Update Event",
    "description": "Triggered when the wallet balance updates",
    "type": "object",
    "properties": {
        "type": {
            "const": "@@sports/wallet_update"
        },
        "payload": {
            "type": "object",
            "properties": {
                "amount": {
                    "type": "number"
                },
                "currency": {
                    "type": "string"
                }
            },
            "required": [
                "amount",
                "currency"
            ]
        }
    },
    "required": [
        "type",
        "payload"
    ],
    "additionalProperties": false
}
```


