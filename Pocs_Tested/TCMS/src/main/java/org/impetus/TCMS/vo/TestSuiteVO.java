/**
 * 
 */
package org.impetus.TCMS.vo;

/**
 * @author kratika.gupta
 * 
 */
public class TestSuiteVO {

	Integer tSuiteId;
	String name;

	/**
	 * @param tSuiteId
	 * @param name
	 */
	public TestSuiteVO(Integer tSuiteId, String name) {
		super();
		this.tSuiteId = tSuiteId;
		this.name = name;
	}

	/**
	 * @return the tSuiteId
	 */
	public Integer gettSuiteId() {
		return tSuiteId;
	}

	/**
	 * @param tSuiteId
	 *            the tSuiteId to set
	 */
	public void settSuiteId(Integer tSuiteId) {
		this.tSuiteId = tSuiteId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TestSuiteVO [tSuiteId=" + tSuiteId + ", name=" + name + "]";
	}

}
