

# Longitude and Latitude

<p>A geographical coordinate on a planet (most commonly Earth).</p>

<table>
<tbody>
<tr><th>$id</th><td>geographical-location.schema.json</td></tr>
<tr><th>$schema</th><td>http://json-schema.org/draft-07/schema#</td></tr>
</tbody>
</table>

## Properties

<table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#latitude">latitude</a></td><td>Number</td></tr><tr><td colspan="2"><a href="#longitude">longitude</a></td><td>Number</td></tr></tbody></table>



<hr />


## latitude


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    <tr>
      <th>Minimum</th>
      <td colspan="2">-90</td>
    </tr><tr>
      <th>Maximum</th>
      <td colspan="2">90</td>
    </tr>
  </tbody>
</table>




## longitude


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    <tr>
      <th>Minimum</th>
      <td colspan="2">-180</td>
    </tr><tr>
      <th>Maximum</th>
      <td colspan="2">180</td>
    </tr>
  </tbody>
</table>









<hr />

## Schema
```
{
    "$id": "geographical-location.schema.json",
    "$schema": "http://json-schema.org/draft-07/schema#",
    "title": "Longitude and Latitude",
    "description": "A geographical coordinate on a planet (most commonly Earth).",
    "required": [
        "latitude",
        "longitude"
    ],
    "type": "object",
    "properties": {
        "latitude": {
            "type": "number",
            "minimum": -90,
            "maximum": 90
        },
        "longitude": {
            "type": "number",
            "minimum": -180,
            "maximum": 180
        }
    }
}
```


