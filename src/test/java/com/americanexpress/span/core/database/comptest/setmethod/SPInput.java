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
package com.americanexpress.span.core.database.comptest.setmethod;

import com.americanexpress.span.annotation.Field;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

public class SPInput {

    private String inString;

    private int inInt;

    private Integer inInteger;

    private long inLong;

    private Long inLongObj;

    private float inFloat;

    private Float inFloatObj;

    private double inDouble;

    private Double inDoubleObj;

    private BigInteger inBigInteger;

    private BigDecimal inDecimal;

    private boolean inBoolean;

    private Boolean inBooleanObj;

    private LocalDateTime inTimestamp;

    public String getInString() {
        return inString;
    }

    @Field(name = "in_str")
    public void setInString(String inString) {
        this.inString = inString;
    }

    public int getInInt() {
        return inInt;
    }

    @Field(name = "in_int")
    public void setInInt(int inInt) {
        this.inInt = inInt;
    }

    public Integer getInInteger() {
        return inInteger;
    }

    @Field(name = "in_integer")
    public void setInInteger(Integer inInteger) {
        this.inInteger = inInteger;
    }

    public long getInLong() {
        return inLong;
    }

    @Field(name = "in_long")
    public void setInLong(long inLong) {
        this.inLong = inLong;
    }

    public Long getInLongObj() {
        return inLongObj;
    }

    @Field(name = "in_longObj")
    public void setInLongObj(Long inLongObj) {
        this.inLongObj = inLongObj;
    }

    public float getInFloat() {
        return inFloat;
    }

    @Field(name = "in_float")
    public void setInFloat(float inFloat) {
        this.inFloat = inFloat;
    }

    public Float getInFloatObj() {
        return inFloatObj;
    }

    @Field(name = "in_floatObj")
    public void setInFloatObj(Float inFloatObj) {
        this.inFloatObj = inFloatObj;
    }

    public double getInDouble() {
        return inDouble;
    }

    @Field(name = "in_double")
    public void setInDouble(double inDouble) {
        this.inDouble = inDouble;
    }

    public Double getInDoubleObj() {
        return inDoubleObj;
    }

    @Field(name = "in_doubleObj")
    public void setInDoubleObj(Double inDoubleObj) {
        this.inDoubleObj = inDoubleObj;
    }

    public BigInteger getInBigInteger() {
        return inBigInteger;
    }

    @Field(name = "in_bigint")
    public void setInBigInteger(BigInteger inBigInteger) {
        this.inBigInteger = inBigInteger;
    }

    public BigDecimal getInDecimal() {
        return inDecimal;
    }

    @Field(name = "in_decimal")
    public void setInDecimal(BigDecimal inDecimal) {
        this.inDecimal = inDecimal;
    }

    public boolean isInBoolean() {
        return inBoolean;
    }

    @Field(name = "in_boolean")
    public void setInBoolean(boolean inBoolean) {
        this.inBoolean = inBoolean;
    }

    public Boolean getInBooleanObj() {
        return inBooleanObj;
    }

    @Field(name = "in_booleanObj")
    public void setInBooleanObj(Boolean inBooleanObj) {
        this.inBooleanObj = inBooleanObj;
    }

    public LocalDateTime getInTimestamp() {
        return inTimestamp;
    }

    @Field(name = "in_timestamp")
    public void setInTimestamp(LocalDateTime inTimestamp) {
        this.inTimestamp = inTimestamp;
    }

    @Override
    public String toString() {
        return "SPInput{" +
                "inString='" + inString + '\'' +
                ", inInt=" + inInt +
                ", inInteger=" + inInteger +
                ", inFloat=" + inFloat +
                ", inFloatObj=" + inFloatObj +
                ", inDouble=" + inDouble +
                ", inDoubleObj=" + inDoubleObj +
                ", inBigInteger=" + inBigInteger +
                ", inDecimal=" + inDecimal +
                ", inBoolean=" + inBoolean +
                ", inBooleanObj=" + inBooleanObj +
                '}';
    }
}
