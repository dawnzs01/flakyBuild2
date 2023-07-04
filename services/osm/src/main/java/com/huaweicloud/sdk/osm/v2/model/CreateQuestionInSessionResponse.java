package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateQuestionInSessionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "answers")

    private List<AnswerQaPair> answers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "answer_type")

    private Integer answerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public CreateQuestionInSessionResponse withAnswers(List<AnswerQaPair> answers) {
        this.answers = answers;
        return this;
    }

    public CreateQuestionInSessionResponse addAnswersItem(AnswerQaPair answersItem) {
        if (this.answers == null) {
            this.answers = new ArrayList<>();
        }
        this.answers.add(answersItem);
        return this;
    }

    public CreateQuestionInSessionResponse withAnswers(Consumer<List<AnswerQaPair>> answersSetter) {
        if (this.answers == null) {
            this.answers = new ArrayList<>();
        }
        answersSetter.accept(this.answers);
        return this;
    }

    /**
     * 答案列表
     * @return answers
     */
    public List<AnswerQaPair> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerQaPair> answers) {
        this.answers = answers;
    }

    public CreateQuestionInSessionResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public CreateQuestionInSessionResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误描述
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public CreateQuestionInSessionResponse withAnswerType(Integer answerType) {
        this.answerType = answerType;
        return this;
    }

    /**
     * 答案类型：0 知识库回复,1 技能回复,2 闲聊回复,3 华为云答案。
     * minimum: 0
     * maximum: 10
     * @return answerType
     */
    public Integer getAnswerType() {
        return answerType;
    }

    public void setAnswerType(Integer answerType) {
        this.answerType = answerType;
    }

    public CreateQuestionInSessionResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求Id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateQuestionInSessionResponse createQuestionInSessionResponse = (CreateQuestionInSessionResponse) o;
        return Objects.equals(this.answers, createQuestionInSessionResponse.answers)
            && Objects.equals(this.errorCode, createQuestionInSessionResponse.errorCode)
            && Objects.equals(this.errorMsg, createQuestionInSessionResponse.errorMsg)
            && Objects.equals(this.answerType, createQuestionInSessionResponse.answerType)
            && Objects.equals(this.requestId, createQuestionInSessionResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answers, errorCode, errorMsg, answerType, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateQuestionInSessionResponse {\n");
        sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    answerType: ").append(toIndentedString(answerType)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
