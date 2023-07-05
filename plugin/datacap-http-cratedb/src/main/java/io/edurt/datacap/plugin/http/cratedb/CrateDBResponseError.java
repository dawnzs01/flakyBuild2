package io.edurt.datacap.plugin.http.cratedb;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CrateDBResponseError
{
    @JsonProperty(value = "message")
    private String message;

    @JsonProperty(value = "code")
    private String code;
}
