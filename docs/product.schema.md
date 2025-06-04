

# Product

<p>A product from Acme&#x27;s catalog</p>

<table>
<tbody>
<tr><th>$id</th><td>product.schema.json</td></tr>
<tr><th>$schema</th><td>http://json-schema.org/draft-07/schema#</td></tr>
</tbody>
</table>

## Properties

<table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#productid">productId</a></td><td>Integer</td></tr><tr><td colspan="2"><a href="#productname">productName</a></td><td>String</td></tr><tr><td colspan="2"><a href="#price">price</a></td><td>Number</td></tr><tr><td colspan="2"><a href="#tags">tags</a></td><td>Array</td></tr><tr><td colspan="2"><a href="#dimensions">dimensions</a></td><td>Object</td></tr><tr><td colspan="2"><a href="#warehouselocation">warehouseLocation</a></td><td>Object (of type <a href="geographical-location.schema.html">Longitude and Latitude</a>)</td></tr></tbody></table>



<hr />


## productId


<table class="jssd-property-table">
  <tbody>
    <tr>
      <th>Description</th>
      <td colspan="2">The unique identifier for a product</td>
    </tr>
    <tr><th>Type</th><td colspan="2">Integer</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>




## productName


<table class="jssd-property-table">
  <tbody>
    <tr>
      <th>Description</th>
      <td colspan="2">Name of the product</td>
    </tr>
    <tr><th>Type</th><td colspan="2">String</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>




## price


<table class="jssd-property-table">
  <tbody>
    <tr>
      <th>Description</th>
      <td colspan="2">The price of the product</td>
    </tr>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>




## tags


<table class="jssd-property-table">
  <tbody>
    <tr>
      <th>Description</th>
      <td colspan="2">Tags for the product</td>
    </tr>
    <tr><th>Type</th><td colspan="2">Array</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    <tr>
      <th>Unique Items</th>
      <td colspan="2">true</td>
    </tr><tr>
      <th>Min Items</th>
      <td colspan="2">1</td>
    </tr>
  </tbody>
</table>




## dimensions


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Object</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    
  </tbody>
</table>

### Properties
  <table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#dimensionslength">length</a></td><td>Number</td></tr><tr><td colspan="2"><a href="#dimensionswidth">width</a></td><td>Number</td></tr><tr><td colspan="2"><a href="#dimensionsheight">height</a></td><td>Number</td></tr></tbody></table>


### dimensions.length


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>




### dimensions.width


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>




### dimensions.height


<table class="jssd-property-table">
  <tbody>
    <tr><th>Type</th><td colspan="2">Number</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">Yes</td>
    </tr>
    
  </tbody>
</table>





## warehouseLocation

  <p>Defined in <a href="geographical-location.schema.html">geographical-location.schema.html</a></p>

<table class="jssd-property-table">
  <tbody>
    <tr>
      <th>$id</th>
      <td colspan="2">geographical-location.schema.json</td>
    </tr>
    <tr>
      <th>Title</th>
      <td colspan="2">Longitude and Latitude</td>
    </tr>
    <tr>
      <th>Description</th>
      <td colspan="2">Coordinates of the warehouse where the product is located.</td>
    </tr>
    <tr><th>Type</th><td colspan="2">Object (of type <a href="geographical-location.schema.html">Longitude and Latitude</a>)</td></tr>
    <tr>
      <th>Required</th>
      <td colspan="2">No</td>
    </tr>
    
  </tbody>
</table>

### Properties
  <table class="jssd-properties-table"><thead><tr><th colspan="2">Name</th><th>Type</th></tr></thead><tbody><tr><td colspan="2"><a href="#warehouselocationlatitude">latitude</a></td><td>Number</td></tr><tr><td colspan="2"><a href="#warehouselocationlongitude">longitude</a></td><td>Number</td></tr></tbody></table>








<hr />

## Schema
```
{
    "$schema": "http://json-schema.org/draft-07/schema#",
    "$id": "product.schema.json",
    "title": "Product",
    "description": "A product from Acme's catalog",
    "type": "object",
    "definitions": {
        "GeographicalLocation": {
            "type": "object",
            "properties": {
                "latitude": {
                    "type": "number"
                },
                "longitude": {
                    "type": "number"
                }
            },
            "required": [
                "latitude",
                "longitude"
            ]
        }
    },
    "properties": {
        "productId": {
            "description": "The unique identifier for a product",
            "type": "integer"
        },
        "productName": {
            "description": "Name of the product",
            "type": "string"
        },
        "price": {
            "description": "The price of the product",
            "type": "number",
            "exclusiveMinimum": 0
        },
        "tags": {
            "description": "Tags for the product",
            "type": "array",
            "items": {
                "type": "string"
            },
            "minItems": 1,
            "uniqueItems": true
        },
        "dimensions": {
            "type": "object",
            "properties": {
                "length": {
                    "type": "number"
                },
                "width": {
                    "type": "number"
                },
                "height": {
                    "type": "number"
                }
            },
            "required": [
                "length",
                "width",
                "height"
            ]
        },
        "warehouseLocation": {
            "description": "Coordinates of the warehouse where the product is located.",
            "$ref": "geographical-location.schema.json"
        }
    },
    "required": [
        "productId",
        "productName",
        "price"
    ]
}
```


