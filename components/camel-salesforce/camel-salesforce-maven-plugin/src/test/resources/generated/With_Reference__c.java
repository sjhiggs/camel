/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin.
 */
package $packageName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.apache.camel.component.salesforce.api.dto.AbstractDescribedSObjectBase;
import org.apache.camel.component.salesforce.api.dto.Attributes;
import org.apache.camel.component.salesforce.api.dto.ChildRelationShip;
import org.apache.camel.component.salesforce.api.dto.InfoUrls;
import org.apache.camel.component.salesforce.api.dto.NamedLayoutInfo;
import org.apache.camel.component.salesforce.api.dto.RecordTypeInfo;
import org.apache.camel.component.salesforce.api.dto.SObjectDescription;
import org.apache.camel.component.salesforce.api.dto.SObjectDescriptionUrls;
import org.apache.camel.component.salesforce.api.dto.SObjectField;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import org.apache.camel.component.salesforce.api.utils.AsNestedPropertyResolver;

/**
 * Salesforce DTO for SObject With_Reference__c
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public class With_Reference__c extends AbstractDescribedSObjectBase {

    public With_Reference__c() {
        getAttributes().setType("With_Reference__c");
    }

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    @JsonTypeResolver(AsNestedPropertyResolver.class)
    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "attributes.type",
        defaultImpl = AbstractDescribedSObjectBase.class)
    @JsonSubTypes({
    })
    private AbstractDescribedSObjectBase Owner;

    @JsonProperty("Owner")
    public AbstractDescribedSObjectBase getOwner() {
        return this.Owner;
    }

    @JsonProperty("Owner")
    public void setOwner(AbstractDescribedSObjectBase Owner) {
        this.Owner = Owner;
    }
    private AbstractDescribedSObjectBase CreatedBy;

    @JsonProperty("CreatedBy")
    public AbstractDescribedSObjectBase getCreatedBy() {
        return this.CreatedBy;
    }

    @JsonProperty("CreatedBy")
    public void setCreatedBy(AbstractDescribedSObjectBase CreatedBy) {
        this.CreatedBy = CreatedBy;
    }
    private AbstractDescribedSObjectBase LastModifiedBy;

    @JsonProperty("LastModifiedBy")
    public AbstractDescribedSObjectBase getLastModifiedBy() {
        return this.LastModifiedBy;
    }

    @JsonProperty("LastModifiedBy")
    public void setLastModifiedBy(AbstractDescribedSObjectBase LastModifiedBy) {
        this.LastModifiedBy = LastModifiedBy;
    }
    private String account_ref__c;

    @JsonProperty("account_ref__c")
    public String getaccount_ref__c() {
        return this.account_ref__c;
    }

    @JsonProperty("account_ref__c")
    public void setaccount_ref__c(String account_ref__c) {
        this.account_ref__c = account_ref__c;
    }

    private Account account_ref__r;

    @JsonProperty("account_ref__r")
    public Account getaccount_ref__r() {
        return this.account_ref__r;
    }

    @JsonProperty("account_ref__r")
    public void setaccount_ref__r(Account account_ref__r) {
        this.account_ref__r = account_ref__r;
    }
    private String ProductId__c;

    @JsonProperty("ProductId__c")
    public String getProductId__c() {
        return this.ProductId__c;
    }

    @JsonProperty("ProductId__c")
    public void setProductId__c(String ProductId__c) {
        this.ProductId__c = ProductId__c;
    }

    private AbstractDescribedSObjectBase ProductId__r;

    @JsonProperty("ProductId__r")
    public AbstractDescribedSObjectBase getProductId__r() {
        return this.ProductId__r;
    }

    @JsonProperty("ProductId__r")
    public void setProductId__r(AbstractDescribedSObjectBase ProductId__r) {
        this.ProductId__r = ProductId__r;
    }
    private String External__c;

    @JsonProperty("External__c")
    public String getExternal__c() {
        return this.External__c;
    }

    @JsonProperty("External__c")
    public void setExternal__c(String External__c) {
        this.External__c = External__c;
    }

    private AbstractDescribedSObjectBase External__r;

    @JsonProperty("External__r")
    public AbstractDescribedSObjectBase getExternal__r() {
        return this.External__r;
    }

    @JsonProperty("External__r")
    public void setExternal__r(AbstractDescribedSObjectBase External__r) {
        this.External__r = External__r;
    }

    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();


        description.setActivateable(false);
        description.setCompactLayoutable(true);
        description.setCreateable(true);
        description.setCustom(true);
        description.setCustomSetting(false);
        description.setDeletable(true);
        description.setDeprecatedAndHidden(false);
        description.setFeedEnabled(false);

        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Record ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("OwnerId", "Owner ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("Name", "With Reference Name", "string", "xsd:string", 80, false, true, true, false, false, false, true);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("account_ref__c", "Account", "reference", "tns:ID", 18, false, true, false, false, true, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("ProductId__c", "Product", "reference", "tns:ID", 18, false, true, false, false, true, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("External__c", "With External Id", "reference", "tns:ID", 18, false, true, false, false, true, false, false);
        fields1.add(sObjectField12);

        description.setKeyPrefix("a04");
        description.setLabel("With Reference");
        description.setLabelPlural("With References");
        description.setLayoutable(true);
        description.setMergeable(false);
        description.setMruEnabled(false);
        description.setName("With_Reference__c");
        description.setQueryable(true);

        final List<RecordTypeInfo> recordTypeInfos1 = new ArrayList<>();
        description.setRecordTypeInfos(recordTypeInfos1);

        final RecordTypeInfo recordTypeInfo1 = new RecordTypeInfo();
        recordTypeInfos1.add(recordTypeInfo1);

        recordTypeInfo1.setAvailable(true);
        recordTypeInfo1.setDefaultRecordTypeMapping(true);
        recordTypeInfo1.setName("Master");
        recordTypeInfo1.setRecordTypeId("012000000000000AAA");

        final InfoUrls infoUrls1 = new InfoUrls();
        infoUrls1.setLayout("/services/data/v42.0/sobjects/With_Reference__c/describe/layouts/012000000000000AAA");
        recordTypeInfo1.setUrls(infoUrls1);


        description.setReplicateable(true);
        description.setRetrieveable(true);
        description.setSearchLayoutable("false");
        description.setSearchable(false);
        description.setTriggerable(true);
        description.setUndeletable(true);
        description.setUpdateable(true);

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setApprovalLayouts("/services/data/v42.0/sobjects/With_Reference__c/describe/approvalLayouts");
        sObjectDescriptionUrls1.setCompactLayouts("/services/data/v42.0/sobjects/With_Reference__c/describe/compactLayouts");
        sObjectDescriptionUrls1.setDefaultValues("/services/data/v42.0/sobjects/With_Reference__c/defaultValues?recordTypeId&fields");
        sObjectDescriptionUrls1.setDescribe("/services/data/v42.0/sobjects/With_Reference__c/describe");
        sObjectDescriptionUrls1.setLayouts("/services/data/v42.0/sobjects/With_Reference__c/describe/layouts");
        sObjectDescriptionUrls1.setQuickActions("/services/data/v42.0/sobjects/With_Reference__c/quickActions");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v42.0/sobjects/With_Reference__c/{ID}");
        sObjectDescriptionUrls1.setSobject("/services/data/v42.0/sobjects/With_Reference__c");
        sObjectDescriptionUrls1.setUiDetailTemplate("https://eu11.salesforce.com/{ID}");
        sObjectDescriptionUrls1.setUiEditTemplate("https://eu11.salesforce.com/{ID}/e");
        sObjectDescriptionUrls1.setUiNewRecord("https://eu11.salesforce.com/a04/e");
        description.setUrls(sObjectDescriptionUrls1);

        return description;
    }
}
