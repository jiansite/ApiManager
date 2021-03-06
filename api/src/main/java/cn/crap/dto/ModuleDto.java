package cn.crap.dto;

/**
 * Automatic generation by tools
 * dto: exchange data with view
 */
public class ModuleDto {
	private String id;
	private String name;
	private Byte status;
	private Long sequence;
	private String url;
	private Byte canDelete;
	private String remark;
	private String userId;
	private String projectId;
	private String templateId;
	private String templateName;
	private Integer version;
	private String category;
	private String projectName;
	private String createTimeStr;
	private Boolean hasStaticize;

	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void setStatus(Byte status){
		this.status=status;
	}
	public Byte getStatus(){
		return status;
	}

	public void setSequence(Long sequence){
		this.sequence=sequence;
	}
	public Long getSequence(){
		return sequence;
	}

	public void setUrl(String url){
		this.url=url;
	}
	public String getUrl(){
		return url;
	}

	public void setCanDelete(Byte canDelete){
		this.canDelete=canDelete;
	}
	public Byte getCanDelete(){
		return canDelete;
	}

	public void setRemark(String remark){
		this.remark=remark;
	}
	public String getRemark(){
		return remark;
	}

	public void setUserId(String userId){
		this.userId=userId;
	}
	public String getUserId(){
		return userId;
	}

	public void setProjectId(String projectId){
		this.projectId=projectId;
	}
	public String getProjectId(){
		return projectId;
	}

	public void setTemplateId(String templateId){
		this.templateId=templateId;
	}
	public String getTemplateId(){
		return templateId;
	}

	public void setVersion(Integer version){
		this.version=version;
	}
	public Integer getVersion(){
		return version;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCreateTimeStr() {
		return createTimeStr;
	}

	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public Boolean getHasStaticize() {
		return hasStaticize;
	}

	public void setHasStaticize(Boolean hasStaticize) {
		this.hasStaticize = hasStaticize;
	}
}
