package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TemplateInfo
 */
public class TemplateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "productshorts")

    private List<String> productshorts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "products")

    private List<TemplateProductExt> products = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private List<TopicCategory> topic = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nickname")

    private String nickname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Integer score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store")

    private Integer store;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_info")

    private String storeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_count")

    private Integer viewCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_count")

    private Integer usageCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "published_at")

    private String publishedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorite_state")

    private Integer favoriteState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagInfo> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_static")

    private Integer isStatic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintainers")

    private List<String> maintainers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_template")

    private PipelineTemplateInfo pipelineTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_source")

    private Integer platformSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "references")

    private List<Reference> references = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Object properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependencies")

    private List<Object> dependencies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_type")

    private String dependencyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forum_id")

    private Integer forumId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_size")

    private Integer fileSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment")

    private Object deployment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_id")

    private String updateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_cloudide")

    private Boolean isSupportCloudide;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_notices")

    private Boolean hasNotices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependents")

    private List<Dependent> dependents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependent_services")

    private String dependentServices;

    public TemplateInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 模板id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TemplateInfo withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 模板名。
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TemplateInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TemplateInfo withProductshorts(List<String> productshorts) {
        this.productshorts = productshorts;
        return this;
    }

    public TemplateInfo addProductshortsItem(String productshortsItem) {
        if (this.productshorts == null) {
            this.productshorts = new ArrayList<>();
        }
        this.productshorts.add(productshortsItem);
        return this;
    }

    public TemplateInfo withProductshorts(Consumer<List<String>> productshortsSetter) {
        if (this.productshorts == null) {
            this.productshorts = new ArrayList<>();
        }
        productshortsSetter.accept(this.productshorts);
        return this;
    }

    /**
     * 模板关联的所有云服务（产品短名）。
     * @return productshorts
     */
    public List<String> getProductshorts() {
        return productshorts;
    }

    public void setProductshorts(List<String> productshorts) {
        this.productshorts = productshorts;
    }

    public TemplateInfo withProducts(List<TemplateProductExt> products) {
        this.products = products;
        return this;
    }

    public TemplateInfo addProductsItem(TemplateProductExt productsItem) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        this.products.add(productsItem);
        return this;
    }

    public TemplateInfo withProducts(Consumer<List<TemplateProductExt>> productsSetter) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }
        productsSetter.accept(this.products);
        return this;
    }

    /**
     * 模板关联的云产品。
     * @return products
     */
    public List<TemplateProductExt> getProducts() {
        return products;
    }

    public void setProducts(List<TemplateProductExt> products) {
        this.products = products;
    }

    public TemplateInfo withTopic(List<TopicCategory> topic) {
        this.topic = topic;
        return this;
    }

    public TemplateInfo addTopicItem(TopicCategory topicItem) {
        if (this.topic == null) {
            this.topic = new ArrayList<>();
        }
        this.topic.add(topicItem);
        return this;
    }

    public TemplateInfo withTopic(Consumer<List<TopicCategory>> topicSetter) {
        if (this.topic == null) {
            this.topic = new ArrayList<>();
        }
        topicSetter.accept(this.topic);
        return this;
    }

    /**
     * 模板标签。
     * @return topic
     */
    public List<TopicCategory> getTopic() {
        return topic;
    }

    public void setTopic(List<TopicCategory> topic) {
        this.topic = topic;
    }

    public TemplateInfo withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 模板创建者id。
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public TemplateInfo withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 模板创建者,有别名返回别名。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public TemplateInfo withNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    /**
     * 模板创建者,有别名返回别名。
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public TemplateInfo withScore(Integer score) {
        this.score = score;
        return this;
    }

    /**
     * 模板评分（点赞数）。
     * minimum: 1
     * maximum: 99999
     * @return score
     */
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public TemplateInfo withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 模板标签（new、hot等）。
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public TemplateInfo withStore(Integer store) {
        this.store = store;
        return this;
    }

    /**
     * 代码存储位置。
     * minimum: 0
     * maximum: 9
     * @return store
     */
    public Integer getStore() {
        return store;
    }

    public void setStore(Integer store) {
        this.store = store;
    }

    public TemplateInfo withStoreInfo(String storeInfo) {
        this.storeInfo = storeInfo;
        return this;
    }

    /**
     * 获取代码模版所需的信息。
     * @return storeInfo
     */
    public String getStoreInfo() {
        return storeInfo;
    }

    public void setStoreInfo(String storeInfo) {
        this.storeInfo = storeInfo;
    }

    public TemplateInfo withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 模板状态： - 0：审核中 - 1：已上架 - 2：未上架（已下架） - 3：未上架（合规检查不通过） - 4：未上架（待上架） - 5：已删除 
     * minimum: 0
     * maximum: 5
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public TemplateInfo withViewCount(Integer viewCount) {
        this.viewCount = viewCount;
        return this;
    }

    /**
     * 访问量。
     * minimum: 1
     * maximum: 99999
     * @return viewCount
     */
    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public TemplateInfo withUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
        return this;
    }

    /**
     * 引用量。
     * minimum: 1
     * maximum: 99999
     * @return usageCount
     */
    public Integer getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }

    public TemplateInfo withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public TemplateInfo withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public TemplateInfo withPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    /**
     * 模板上架时间。
     * @return publishedAt
     */
    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public TemplateInfo withFavoriteState(Integer favoriteState) {
        this.favoriteState = favoriteState;
        return this;
    }

    /**
     * 点赞状态： - 1：点赞 - 0：未点赞 
     * minimum: 0
     * maximum: 1
     * @return favoriteState
     */
    public Integer getFavoriteState() {
        return favoriteState;
    }

    public void setFavoriteState(Integer favoriteState) {
        this.favoriteState = favoriteState;
    }

    public TemplateInfo withTags(List<TagInfo> tags) {
        this.tags = tags;
        return this;
    }

    public TemplateInfo addTagsItem(TagInfo tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public TemplateInfo withTags(Consumer<List<TagInfo>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 模板标签。
     * @return tags
     */
    public List<TagInfo> getTags() {
        return tags;
    }

    public void setTags(List<TagInfo> tags) {
        this.tags = tags;
    }

    public TemplateInfo withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 模板类型： - 0：doc - 1：code - 2：pipeline - 3：devops 四种 
     * minimum: 0
     * maximum: 3
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public TemplateInfo withIsStatic(Integer isStatic) {
        this.isStatic = isStatic;
        return this;
    }

    /**
     * 动、静态代码模板标识： - 0：动态模板codetemplate - 1：静态模板codesample 
     * minimum: 0
     * maximum: 1
     * @return isStatic
     */
    public Integer getIsStatic() {
        return isStatic;
    }

    public void setIsStatic(Integer isStatic) {
        this.isStatic = isStatic;
    }

    public TemplateInfo withMaintainers(List<String> maintainers) {
        this.maintainers = maintainers;
        return this;
    }

    public TemplateInfo addMaintainersItem(String maintainersItem) {
        if (this.maintainers == null) {
            this.maintainers = new ArrayList<>();
        }
        this.maintainers.add(maintainersItem);
        return this;
    }

    public TemplateInfo withMaintainers(Consumer<List<String>> maintainersSetter) {
        if (this.maintainers == null) {
            this.maintainers = new ArrayList<>();
        }
        maintainersSetter.accept(this.maintainers);
        return this;
    }

    /**
     * 模板相关联的所有维护人账号名称。
     * @return maintainers
     */
    public List<String> getMaintainers() {
        return maintainers;
    }

    public void setMaintainers(List<String> maintainers) {
        this.maintainers = maintainers;
    }

    public TemplateInfo withPipelineTemplate(PipelineTemplateInfo pipelineTemplate) {
        this.pipelineTemplate = pipelineTemplate;
        return this;
    }

    public TemplateInfo withPipelineTemplate(Consumer<PipelineTemplateInfo> pipelineTemplateSetter) {
        if (this.pipelineTemplate == null) {
            this.pipelineTemplate = new PipelineTemplateInfo();
            pipelineTemplateSetter.accept(this.pipelineTemplate);
        }

        return this;
    }

    /**
     * Get pipelineTemplate
     * @return pipelineTemplate
     */
    public PipelineTemplateInfo getPipelineTemplate() {
        return pipelineTemplate;
    }

    public void setPipelineTemplate(PipelineTemplateInfo pipelineTemplate) {
        this.pipelineTemplate = pipelineTemplate;
    }

    public TemplateInfo withPlatformSource(Integer platformSource) {
        this.platformSource = platformSource;
        return this;
    }

    /**
     * 平台来源： - 0：codelabs - 1：devstar 
     * minimum: 0
     * maximum: 1
     * @return platformSource
     */
    public Integer getPlatformSource() {
        return platformSource;
    }

    public void setPlatformSource(Integer platformSource) {
        this.platformSource = platformSource;
    }

    public TemplateInfo withReferences(List<Reference> references) {
        this.references = references;
        return this;
    }

    public TemplateInfo addReferencesItem(Reference referencesItem) {
        if (this.references == null) {
            this.references = new ArrayList<>();
        }
        this.references.add(referencesItem);
        return this;
    }

    public TemplateInfo withReferences(Consumer<List<Reference>> referencesSetter) {
        if (this.references == null) {
            this.references = new ArrayList<>();
        }
        referencesSetter.accept(this.references);
        return this;
    }

    /**
     * 相关文档，示例，帖子。
     * @return references
     */
    public List<Reference> getReferences() {
        return references;
    }

    public void setReferences(List<Reference> references) {
        this.references = references;
    }

    public TemplateInfo withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * 模板自定义参数列表。
     * @return properties
     */
    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public TemplateInfo withDependencies(List<Object> dependencies) {
        this.dependencies = dependencies;
        return this;
    }

    public TemplateInfo addDependenciesItem(Object dependenciesItem) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        this.dependencies.add(dependenciesItem);
        return this;
    }

    public TemplateInfo withDependencies(Consumer<List<Object>> dependenciesSetter) {
        if (this.dependencies == null) {
            this.dependencies = new ArrayList<>();
        }
        dependenciesSetter.accept(this.dependencies);
        return this;
    }

    /**
     * dependency信息。
     * @return dependencies
     */
    public List<Object> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<Object> dependencies) {
        this.dependencies = dependencies;
    }

    public TemplateInfo withDependencyType(String dependencyType) {
        this.dependencyType = dependencyType;
        return this;
    }

    /**
     * dependency类型。
     * @return dependencyType
     */
    public String getDependencyType() {
        return dependencyType;
    }

    public void setDependencyType(String dependencyType) {
        this.dependencyType = dependencyType;
    }

    public TemplateInfo withForumId(Integer forumId) {
        this.forumId = forumId;
        return this;
    }

    /**
     * 关联论坛板块id。
     * minimum: 0
     * maximum: 100000
     * @return forumId
     */
    public Integer getForumId() {
        return forumId;
    }

    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    public TemplateInfo withFileSize(Integer fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * 模板文件解压缩之后的大小(单位:KB)。
     * minimum: 0
     * maximum: 2147483647
     * @return fileSize
     */
    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public TemplateInfo withDeployment(Object deployment) {
        this.deployment = deployment;
        return this;
    }

    /**
     * 部署信息。
     * @return deployment
     */
    public Object getDeployment() {
        return deployment;
    }

    public void setDeployment(Object deployment) {
        this.deployment = deployment;
    }

    public TemplateInfo withUpdateId(String updateId) {
        this.updateId = updateId;
        return this;
    }

    /**
     * 模板关联更新态Id。
     * @return updateId
     */
    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    public TemplateInfo withIsSupportCloudide(Boolean isSupportCloudide) {
        this.isSupportCloudide = isSupportCloudide;
        return this;
    }

    /**
     * 是否支持使用CloudIDE运行源码。
     * @return isSupportCloudide
     */
    public Boolean getIsSupportCloudide() {
        return isSupportCloudide;
    }

    public void setIsSupportCloudide(Boolean isSupportCloudide) {
        this.isSupportCloudide = isSupportCloudide;
    }

    public TemplateInfo withHasNotices(Boolean hasNotices) {
        this.hasNotices = hasNotices;
        return this;
    }

    /**
     * 是否有消息
     * @return hasNotices
     */
    public Boolean getHasNotices() {
        return hasNotices;
    }

    public void setHasNotices(Boolean hasNotices) {
        this.hasNotices = hasNotices;
    }

    public TemplateInfo withDependents(List<Dependent> dependents) {
        this.dependents = dependents;
        return this;
    }

    public TemplateInfo addDependentsItem(Dependent dependentsItem) {
        if (this.dependents == null) {
            this.dependents = new ArrayList<>();
        }
        this.dependents.add(dependentsItem);
        return this;
    }

    public TemplateInfo withDependents(Consumer<List<Dependent>> dependentsSetter) {
        if (this.dependents == null) {
            this.dependents = new ArrayList<>();
        }
        dependentsSetter.accept(this.dependents);
        return this;
    }

    /**
     * 模板部署方式依赖信息
     * @return dependents
     */
    public List<Dependent> getDependents() {
        return dependents;
    }

    public void setDependents(List<Dependent> dependents) {
        this.dependents = dependents;
    }

    public TemplateInfo withDependentServices(String dependentServices) {
        this.dependentServices = dependentServices;
        return this;
    }

    /**
     * 模板关联云服务。
     * @return dependentServices
     */
    public String getDependentServices() {
        return dependentServices;
    }

    public void setDependentServices(String dependentServices) {
        this.dependentServices = dependentServices;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateInfo templateInfo = (TemplateInfo) o;
        return Objects.equals(this.id, templateInfo.id) && Objects.equals(this.title, templateInfo.title)
            && Objects.equals(this.description, templateInfo.description)
            && Objects.equals(this.productshorts, templateInfo.productshorts)
            && Objects.equals(this.products, templateInfo.products) && Objects.equals(this.topic, templateInfo.topic)
            && Objects.equals(this.creatorId, templateInfo.creatorId)
            && Objects.equals(this.creator, templateInfo.creator)
            && Objects.equals(this.nickname, templateInfo.nickname) && Objects.equals(this.score, templateInfo.score)
            && Objects.equals(this.label, templateInfo.label) && Objects.equals(this.store, templateInfo.store)
            && Objects.equals(this.storeInfo, templateInfo.storeInfo)
            && Objects.equals(this.status, templateInfo.status)
            && Objects.equals(this.viewCount, templateInfo.viewCount)
            && Objects.equals(this.usageCount, templateInfo.usageCount)
            && Objects.equals(this.createdAt, templateInfo.createdAt)
            && Objects.equals(this.updatedAt, templateInfo.updatedAt)
            && Objects.equals(this.publishedAt, templateInfo.publishedAt)
            && Objects.equals(this.favoriteState, templateInfo.favoriteState)
            && Objects.equals(this.tags, templateInfo.tags) && Objects.equals(this.type, templateInfo.type)
            && Objects.equals(this.isStatic, templateInfo.isStatic)
            && Objects.equals(this.maintainers, templateInfo.maintainers)
            && Objects.equals(this.pipelineTemplate, templateInfo.pipelineTemplate)
            && Objects.equals(this.platformSource, templateInfo.platformSource)
            && Objects.equals(this.references, templateInfo.references)
            && Objects.equals(this.properties, templateInfo.properties)
            && Objects.equals(this.dependencies, templateInfo.dependencies)
            && Objects.equals(this.dependencyType, templateInfo.dependencyType)
            && Objects.equals(this.forumId, templateInfo.forumId)
            && Objects.equals(this.fileSize, templateInfo.fileSize)
            && Objects.equals(this.deployment, templateInfo.deployment)
            && Objects.equals(this.updateId, templateInfo.updateId)
            && Objects.equals(this.isSupportCloudide, templateInfo.isSupportCloudide)
            && Objects.equals(this.hasNotices, templateInfo.hasNotices)
            && Objects.equals(this.dependents, templateInfo.dependents)
            && Objects.equals(this.dependentServices, templateInfo.dependentServices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            title,
            description,
            productshorts,
            products,
            topic,
            creatorId,
            creator,
            nickname,
            score,
            label,
            store,
            storeInfo,
            status,
            viewCount,
            usageCount,
            createdAt,
            updatedAt,
            publishedAt,
            favoriteState,
            tags,
            type,
            isStatic,
            maintainers,
            pipelineTemplate,
            platformSource,
            references,
            properties,
            dependencies,
            dependencyType,
            forumId,
            fileSize,
            deployment,
            updateId,
            isSupportCloudide,
            hasNotices,
            dependents,
            dependentServices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    productshorts: ").append(toIndentedString(productshorts)).append("\n");
        sb.append("    products: ").append(toIndentedString(products)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    store: ").append(toIndentedString(store)).append("\n");
        sb.append("    storeInfo: ").append(toIndentedString(storeInfo)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    viewCount: ").append(toIndentedString(viewCount)).append("\n");
        sb.append("    usageCount: ").append(toIndentedString(usageCount)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
        sb.append("    favoriteState: ").append(toIndentedString(favoriteState)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    isStatic: ").append(toIndentedString(isStatic)).append("\n");
        sb.append("    maintainers: ").append(toIndentedString(maintainers)).append("\n");
        sb.append("    pipelineTemplate: ").append(toIndentedString(pipelineTemplate)).append("\n");
        sb.append("    platformSource: ").append(toIndentedString(platformSource)).append("\n");
        sb.append("    references: ").append(toIndentedString(references)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
        sb.append("    dependencyType: ").append(toIndentedString(dependencyType)).append("\n");
        sb.append("    forumId: ").append(toIndentedString(forumId)).append("\n");
        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
        sb.append("    updateId: ").append(toIndentedString(updateId)).append("\n");
        sb.append("    isSupportCloudide: ").append(toIndentedString(isSupportCloudide)).append("\n");
        sb.append("    hasNotices: ").append(toIndentedString(hasNotices)).append("\n");
        sb.append("    dependents: ").append(toIndentedString(dependents)).append("\n");
        sb.append("    dependentServices: ").append(toIndentedString(dependentServices)).append("\n");
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
