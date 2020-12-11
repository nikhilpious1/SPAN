/**
 * Copyright 2020 American Express Travel Related Services Company, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.americanexpress.span.core;

import com.americanexpress.span.constants.SPANTestConstants;
import com.americanexpress.span.exceptions.ConfigurationSPANException;
import com.americanexpress.span.utility.PropertyConfiguration;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;

import static com.americanexpress.span.core.SPANConfigHolderTest.resetHoldSPANConfigForTesting;

public class ConfigurationValidationTest {

    @Rule
    public final EnvironmentVariables environmentVariables = new EnvironmentVariables();

    @Test(expected = ConfigurationSPANException.class)
    public void testDatasourceDetailsNoResult() throws Exception {
        resetHoldSPANConfigForTesting();
        SPANInitialization.initialize(new PropertyConfiguration() {
            public String getFileName(){
                return SPANTestConstants.NO_DATA_SOURCE_DETAILS_CONFIG;
            }
            @Override
            public String getAppProfile() { return SPANTestConstants.EMPTY_STRING;}
        });
    }


    @Test(expected = ConfigurationSPANException.class)
    public void testHostNameNoResult() throws Exception {
        resetHoldSPANConfigForTesting();
        SPANInitialization.initialize(new PropertyConfiguration() {
            public String getFileName(){
                return SPANTestConstants.NO_HOST_NAME_CONFIG;
            }
            @Override
            public String getAppProfile() { return SPANTestConstants.EMPTY_STRING;}
        });
    }


    @Test(expected = ConfigurationSPANException.class)
    public void testPortNoResult() throws Exception {
        resetHoldSPANConfigForTesting();
        SPANInitialization.initialize(new PropertyConfiguration() {
            public String getFileName(){
                return SPANTestConstants.NO_PORT_CONFIG;
            }
            @Override
            public String getAppProfile() { return SPANTestConstants.EMPTY_STRING;}
        });
    }


    @Test(expected = ConfigurationSPANException.class)
    public void testDatabaseNoResult() throws Exception {
        resetHoldSPANConfigForTesting();
        SPANInitialization.initialize(new PropertyConfiguration() {
            public String getFileName(){
                return SPANTestConstants.NO_DATABASE_CONFIG;
            }
            @Override
            public String getAppProfile() { return SPANTestConstants.EMPTY_STRING;}
        });
    }


    @Test(expected = ConfigurationSPANException.class)
    public void testUserNoResult() throws Exception {
        resetHoldSPANConfigForTesting();
        SPANInitialization.initialize(new PropertyConfiguration() {
            public String getFileName(){
                return SPANTestConstants.NO_USER_CONFIG;
            }
            @Override
            public String getAppProfile() { return SPANTestConstants.EMPTY_STRING;}
        });
    }


    @Test(expected = ConfigurationSPANException.class)
    public void testPasswordNoResult() throws Exception {
        resetHoldSPANConfigForTesting();
        SPANInitialization.initialize(new PropertyConfiguration() {
            public String getFileName(){
                return SPANTestConstants.NO_PASSWORD_CONFIG;
            }
            @Override
            public String getAppProfile() { return SPANTestConstants.EMPTY_STRING;}
        });
    }


    @Test(expected = ConfigurationSPANException.class)
    public void testSPDetailsNoResult() throws Exception {
        resetHoldSPANConfigForTesting();
        SPANInitialization.initialize(new PropertyConfiguration() {
            public String getFileName(){
                return SPANTestConstants.NO_SP_USER_DEFINED_KEYS_CONFIG;
            }
            @Override
            public String getAppProfile() { return SPANTestConstants.EMPTY_STRING;}
        });
    }


    @Test(expected = ConfigurationSPANException.class)
    public void testSpSchemaNoResult() throws Exception {
        resetHoldSPANConfigForTesting();
        SPANInitialization.initialize(new PropertyConfiguration() {
            public String getFileName(){
                return SPANTestConstants.NO_SP_SCHEMA_CONFIG;
            }
            @Override
            public String getAppProfile() { return SPANTestConstants.EMPTY_STRING;}
        });
    }


    @Test(expected = ConfigurationSPANException.class)
    public void testSpProcedureNoResult() throws Exception {
        resetHoldSPANConfigForTesting();
        SPANInitialization.initialize(new PropertyConfiguration() {
            public String getFileName(){
                return SPANTestConstants.NO_SP_PROCEDURE_CONFIG;
            }
            @Override
            public String getAppProfile() { return SPANTestConstants.EMPTY_STRING;}
        });
    }

    @Test
    public void testWithURl() throws Exception {
        resetHoldSPANConfigForTesting();
        SPANInitialization.initialize(new PropertyConfiguration() {
            public String getFileName(){
                return SPANTestConstants.SPAN_CONFIG_WITH_URL;
            }
            @Override
            public String getAppProfile() { return SPANTestConstants.EMPTY_STRING;}
        });
        Assert.assertNotNull(SPANConfigHolder.getInstance().getSPANConfig());
    }

    @Test(expected = ConfigurationSPANException.class)
    public void testWithURlWithHostName() throws Exception {
        resetHoldSPANConfigForTesting();
        SPANInitialization.initialize(new PropertyConfiguration() {
            public String getFileName(){
                return SPANTestConstants.SPAN_CONFIG_WITH_URL_AND_HOSTNAME;
            }
            @Override
            public String getAppProfile() { return SPANTestConstants.EMPTY_STRING;}
        });
    }

    @Test(expected = ConfigurationSPANException.class)
    public void testWithURlWithPort() throws Exception {
        resetHoldSPANConfigForTesting();
        SPANInitialization.initialize(new PropertyConfiguration() {
            public String getFileName(){
                return SPANTestConstants.SPAN_CONFIG_WITH_URL_AND_PORT;
            }
            @Override
            public String getAppProfile() { return SPANTestConstants.EMPTY_STRING;}
        });
    }

    @Test(expected = ConfigurationSPANException.class)
    public void testWithURlWithDatabase() throws Exception {
        resetHoldSPANConfigForTesting();
        SPANInitialization.initialize(new PropertyConfiguration() {
            public String getFileName(){
                return SPANTestConstants.SPAN_CONFIG_WITH_URL_AND_DATABASE;
            }
            @Override
            public String getAppProfile() { return SPANTestConstants.EMPTY_STRING;}
        });
    }

    @Test(expected = ConfigurationSPANException.class)
    public void testSpUserKeyDuplicate() throws Exception {
        resetHoldSPANConfigForTesting();
        SPANInitialization.initialize(new PropertyConfiguration() {
            public String getFileName(){
                return SPANTestConstants.DUPLICATE_SP_USER_KEY_UNDER_DIFF_SPAN_KEY_CONFIG;
            }
            @Override
            public String getAppProfile() { return SPANTestConstants.EMPTY_STRING;}
        });
    }

}