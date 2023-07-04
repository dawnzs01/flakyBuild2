package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class KeystoneCreateIdentityProviderRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_provider")

    private IdentityproviderOption identityProvider;

    public KeystoneCreateIdentityProviderRequestBody withIdentityProvider(IdentityproviderOption identityProvider) {
        this.identityProvider = identityProvider;
        return this;
    }

    public KeystoneCreateIdentityProviderRequestBody withIdentityProvider(
        Consumer<IdentityproviderOption> identityProviderSetter) {
        if (this.identityProvider == null) {
            this.identityProvider = new IdentityproviderOption();
            identityProviderSetter.accept(this.identityProvider);
        }

        return this;
    }

    /**
     * Get identityProvider
     * @return identityProvider
     */
    public IdentityproviderOption getIdentityProvider() {
        return identityProvider;
    }

    public void setIdentityProvider(IdentityproviderOption identityProvider) {
        this.identityProvider = identityProvider;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneCreateIdentityProviderRequestBody keystoneCreateIdentityProviderRequestBody =
            (KeystoneCreateIdentityProviderRequestBody) o;
        return Objects.equals(this.identityProvider, keystoneCreateIdentityProviderRequestBody.identityProvider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityProvider);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneCreateIdentityProviderRequestBody {\n");
        sb.append("    identityProvider: ").append(toIndentedString(identityProvider)).append("\n");
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
