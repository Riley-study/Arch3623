# CloudsApi

All URIs are relative to *http://localhost:8080/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCloud**](CloudsApi.md#createCloud) | **POST** /clouds | Создание заказа на облако
[**deleteOrderyID**](CloudsApi.md#deleteOrderyID) | **DELETE** /clouds/{cloud_id} | Метод удаления заказа
[**getAllClouds**](CloudsApi.md#getAllClouds) | **GET** /clouds | Метод получения списка ресурсов на облако
[**getCloudById**](CloudsApi.md#getCloudById) | **GET** /clouds/{cloud_id} | Метод получения заказа на облако по ID

<a name="createCloud"></a>
# **createCloud**
> Clouds createCloud(body)

Создание заказа на облако

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
Error body = new Error(); // Error | 
try {
    Clouds result = apiInstance.createCloud(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#createCloud");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Error**](Error.md)|  | [optional]

### Return type

[**Clouds**](Clouds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: adplication/json
 - **Accept**: adplication/json

<a name="deleteOrderyID"></a>
# **deleteOrderyID**
> Cloud deleteOrderyID(cloudId)

Метод удаления заказа

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
String cloudId = "cloudId_example"; // String | Идентификатор заказа облака
try {
    Cloud result = apiInstance.deleteOrderyID(cloudId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#deleteOrderyID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| Идентификатор заказа облака |

### Return type

[**Cloud**](Cloud.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: adplication/json

<a name="getAllClouds"></a>
# **getAllClouds**
> Clouds getAllClouds()

Метод получения списка ресурсов на облако

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
try {
    Clouds result = apiInstance.getAllClouds();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#getAllClouds");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Clouds**](Clouds.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: adplication/json

<a name="getCloudById"></a>
# **getCloudById**
> Cloud getCloudById(cloudId)

Метод получения заказа на облако по ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CloudsApi;


CloudsApi apiInstance = new CloudsApi();
String cloudId = "cloudId_example"; // String | Идентификатор заказа облака
try {
    Cloud result = apiInstance.getCloudById(cloudId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudsApi#getCloudById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudId** | **String**| Идентификатор заказа облака |

### Return type

[**Cloud**](Cloud.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: adplication/json

