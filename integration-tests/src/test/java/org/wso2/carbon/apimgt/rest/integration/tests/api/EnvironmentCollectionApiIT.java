/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: 0.10.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.api;

import org.wso2.carbon.apimgt.rest.integration.tests.ApiException;
import org.junit.Test;

/**
 * API tests for EnvironmentCollectionApi
 */
public class EnvironmentCollectionApiIT {

    private final EnvironmentCollectionApi api = new EnvironmentCollectionApi();

    
    /**
     * Get all gateway environments
     *
     * This operation can be used to retrieve the list of gateway environments available. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void environmentsGetTest() throws ApiException {
        String apiId = null;
        // EnvironmentList response = api.environmentsGet(apiId);

        // TODO: test validations
    }
    
}
