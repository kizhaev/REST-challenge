RESTful app challenge
======

The app supports adding shops to the storage and searching for the nearest shop by coordinates.

Example
-------

Storing a shop request:
```
POST http://localhost:8080/shop
{
  "shopName":"first",
  "shopAddress": {
    "number":1,
    "postCode":"CM9 5AF"
  }
}
```

Searching for the nearest shop:
```
GET http://localhost:8080/shop/57.3458126/-2.6103229
```
where `57.3458126` is the Latitude and `-2.6103229` is the Longitude.

Search response:
```
{
  "shopName":"first",
  "shopAddress": {
    "number":1,
    "postCode":"AB52 6LH"
  },
  "shopCoordinates": {
    "latitude":57.3458126,
    "longitude":-2.6103229
  }
}
```

Running
--------

Before running the app make sure you pasted you Google API Key to the 
```
/src/main/resources/google.properties
``` 
file. The app uses Google Geocoding API and Google Distance Matrix API.

To start the app run
`gradlew bootRun`

Testing
------- 

Before running the tests make sure you pasted you Google API Key to the Before running the app make sure you pasted you Google API Key to the 
```
/src/main/resources/google.properties
``` 
file. The app uses Google Geocoding API and Google Distance Matrix API.

To run tests run
`gradlew test`
