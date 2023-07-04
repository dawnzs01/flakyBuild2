package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 计划中批量添加测试用例请求体
 */
public class CreateTestCaseInPlanRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private Integer serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_id_list")

    private List<String> testcaseIdList = null;

    public CreateTestCaseInPlanRequestBody withServiceId(Integer serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 注册测试类型服务接口返回的服务id
     * @return serviceId
     */
    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public CreateTestCaseInPlanRequestBody withTestcaseIdList(List<String> testcaseIdList) {
        this.testcaseIdList = testcaseIdList;
        return this;
    }

    public CreateTestCaseInPlanRequestBody addTestcaseIdListItem(String testcaseIdListItem) {
        if (this.testcaseIdList == null) {
            this.testcaseIdList = new ArrayList<>();
        }
        this.testcaseIdList.add(testcaseIdListItem);
        return this;
    }

    public CreateTestCaseInPlanRequestBody withTestcaseIdList(Consumer<List<String>> testcaseIdListSetter) {
        if (this.testcaseIdList == null) {
            this.testcaseIdList = new ArrayList<>();
        }
        testcaseIdListSetter.accept(this.testcaseIdList);
        return this;
    }

    /**
     * 计划下包含的用例个数，数组长度小于50个，只能包含一种测试类型
     * @return testcaseIdList
     */
    public List<String> getTestcaseIdList() {
        return testcaseIdList;
    }

    public void setTestcaseIdList(List<String> testcaseIdList) {
        this.testcaseIdList = testcaseIdList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTestCaseInPlanRequestBody createTestCaseInPlanRequestBody = (CreateTestCaseInPlanRequestBody) o;
        return Objects.equals(this.serviceId, createTestCaseInPlanRequestBody.serviceId)
            && Objects.equals(this.testcaseIdList, createTestCaseInPlanRequestBody.testcaseIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, testcaseIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTestCaseInPlanRequestBody {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    testcaseIdList: ").append(toIndentedString(testcaseIdList)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
