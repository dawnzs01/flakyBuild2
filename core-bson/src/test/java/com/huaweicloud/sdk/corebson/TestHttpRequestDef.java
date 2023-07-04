package com.huaweicloud.sdk.corebson;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import org.bson.BsonReader;
import org.bson.BsonRegularExpression;
import org.bson.BsonTimestamp;
import org.bson.BsonWriter;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecRegistry;

import java.util.Objects;

public class TestHttpRequestDef {
    public static class TestBsonDocRequest extends SdkBsonDocRequest {
        private TestBsonDocBody body;

        public TestBsonDocBody getBody() {
            return body;
        }

        public void setBody(TestBsonDocBody body) {
            this.body = body;
        }

        @Override
        protected void encodeBody(CodecRegistry codecRegistry, BsonWriter writer) {
            codecRegistry.get(TestBsonDocBody.class).encode(writer, this.getBody(), EncoderContext.builder().build());
        }
    }

    public static class TestBsonDocBody {
        private String id;
        private BsonTimestamp timestamp;
        private BsonRegularExpression reg;

        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }

        public BsonTimestamp getTimestamp() {
            return timestamp;
        }
        public void setTimestamp(BsonTimestamp timestamp) {
            this.timestamp = timestamp;
        }

        public BsonRegularExpression getReg() {
            return reg;
        }

        public void setReg(BsonRegularExpression reg) {
            this.reg = reg;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            TestBsonDocResponse that = (TestBsonDocResponse) o;
            return Objects.equals(id, that.id) && Objects.equals(timestamp, that.timestamp) && Objects.equals(reg, that.reg);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, timestamp, reg);
        }
    }

    public static class TestBsonDocResponse extends SdkBsonDocResponse {
        private String id;
        private BsonTimestamp timestamp;
        private BsonRegularExpression reg;

        public String getId() {
            return id;
        }
        public void setId(String id) {
            this.id = id;
        }

        public void setTimestamp(BsonTimestamp timestamp) {
            this.timestamp = timestamp;
        }
        public BsonTimestamp getTimestamp() {
            return timestamp;
        }

        public BsonRegularExpression getReg() {
            return reg;
        }

        public void setReg(BsonRegularExpression reg) {
            this.reg = reg;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            TestBsonDocResponse that = (TestBsonDocResponse) o;
            return Objects.equals(id, that.id) && Objects.equals(timestamp, that.timestamp) && Objects.equals(reg, that.reg);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, timestamp, reg);
        }


        @Override
        protected Object decodeBody(CodecRegistry codecRegistry, BsonReader reader) {
            return codecRegistry.get(TestBsonDocResponse.class).decode(reader, DecoderContext.builder().build());
        }

    }

    public static HttpRequestDef<TestBsonDocRequest, TestBsonDocResponse>
    buildTestBsonDocRequestDef() {
        // basic
        HttpRequestDef.Builder<TestBsonDocRequest, TestBsonDocResponse> builder = HttpRequestDef
                .builder(HttpMethod.POST, TestBsonDocRequest.class, TestBsonDocResponse.class)
                .withName("TestBsonDocRequest")
                .withUri("/test-bson")
                .withContentType("application/bson");

        // requests
        builder.withRequestField("body", LocationType.Body, FieldExistence.NON_NULL_NON_EMPTY,
                TestBsonDocBody.class, f -> f.withMarshaller(TestBsonDocRequest::getBody,
                        TestBsonDocRequest::setBody));

        return builder.build();
    }
}
