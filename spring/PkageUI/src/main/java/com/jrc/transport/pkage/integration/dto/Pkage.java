package com.jrc.transport.pkage.integration.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Pkage {

	private String pkageId;
	private String fromZipCode;
	private String senderName;
	private String toZipCode;
	private String receiverName;
	
	public String getPkageId() {
		return pkageId;
	}
	public void setPkageId(String pkageId) {
		this.pkageId = pkageId;
	}
	public String getFromZipCode() {
		return fromZipCode;
	}
	public void setFromZipCode(String fromZipCode) {
		this.fromZipCode = fromZipCode;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getToZipCode() {
		return toZipCode;
	}
	public void setToZipCode(String toZipCode) {
		this.toZipCode = toZipCode;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pkageId == null) ? 0 : pkageId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pkage other = (Pkage) obj;
		if (pkageId == null) {
			if (other.pkageId != null)
				return false;
		} else if (!pkageId.equals(other.pkageId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pkage [pkageId=" + pkageId + ", fromZipCode=" + fromZipCode
				+ ", senderName=" + senderName + ", toZipCode=" + toZipCode
				+ ", receiverName=" + receiverName + "]";
	}

	public static class PkageBuilder{
		private Pkage pkage;
		public PkageBuilder create(){
			pkage = new Pkage();
			return this;
		}
		public PkageBuilder setPkageId(String pkageId) {
			pkage.setPkageId(pkageId);
			return this;
		}
		public PkageBuilder setFromZipCode(String fromZipCode) {
			pkage.setFromZipCode(fromZipCode);
			return this;
		}
		public PkageBuilder setSenderName(String senderName) {
			pkage.setSenderName(senderName);
			return this;
		}
		public PkageBuilder setToZipCode(String toZipCode) {
			pkage.setToZipCode(toZipCode);
			return this;
		}
		public PkageBuilder setReceiverName(String receiverName) {
			pkage.setReceiverName(receiverName);
			return this;
		}
		public Pkage build(){
			return pkage;
		}
		
	}

	public static PkageBuilder builder(){
		return new Pkage.PkageBuilder();
	}
	
}
