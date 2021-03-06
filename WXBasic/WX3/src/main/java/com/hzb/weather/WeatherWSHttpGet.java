
package com.hzb.weather;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherWSHttpGet", targetNamespace = "http://WebXml.com.cn/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherWSHttpGet {


    /**
     * <br /><h3>����й�ʡ�ݡ�ֱϽ�С��������������ƣ����⣩����֮��Ӧ��ID</h3><p>����������ޣ��������ݣ�DataSet��</p><br />
     * 
     * @return
     *     returns cn.com.webxml.DataSet
     */
    @WebMethod
    @WebResult(name = "DataSet", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public DataSet getRegionDataset();

    /**
     * <br /><h3>����й�ʡ�ݡ�ֱϽ�С���������֮��Ӧ��ID</h3><p>����������ޣ��������ݣ�һά�ַ������顣</p><br />
     * 
     * @return
     *     returns cn.com.webxml.ArrayOfString
     */
    @WebMethod
    @WebResult(name = "ArrayOfString", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public ArrayOfString getRegionProvince();

    /**
     * <br /><h3>��ù���������ƺ���֮��Ӧ��ID</h3><p>����������ޣ��������ݣ�һά�ַ������顣</p><br />
     * 
     * @return
     *     returns cn.com.webxml.ArrayOfString
     */
    @WebMethod
    @WebResult(name = "ArrayOfString", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public ArrayOfString getRegionCountry();

    /**
     * <br /><h3>���֧�ֵĳ���/�������ƺ���֮��Ӧ��ID</h3><p>���������theRegionCode = ʡ�С�����ID�����ƣ��������ݣ�DataSet��</p><br />
     * 
     * @param theRegionCode
     * @return
     *     returns cn.com.webxml.DataSet
     */
    @WebMethod
    @WebResult(name = "DataSet", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public DataSet getSupportCityDataset(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "theRegionCode")
        String theRegionCode);

    /**
     * <br /><h3>���֧�ֵĳ���/�������ƺ���֮��Ӧ��ID</h3><p>���������theRegionCode = ʡ�С�����ID�����ƣ��������ݣ�һά�ַ������顣</p><br />
     * 
     * @param theRegionCode
     * @return
     *     returns cn.com.webxml.ArrayOfString
     */
    @WebMethod
    @WebResult(name = "ArrayOfString", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public ArrayOfString getSupportCityString(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "theRegionCode")
        String theRegionCode);

    /**
     * <br /><h3>�������Ԥ������</h3><p>�������������/����ID�����ƣ��������ݣ�һά�ַ������顣</p><br />
     * 
     * @param theUserID
     * @param theCityCode
     * @return
     *     returns cn.com.webxml.ArrayOfString
     */
    @WebMethod
    @WebResult(name = "ArrayOfString", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public ArrayOfString getWeather(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "theCityCode")
        String theCityCode,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "theUserID")
        String theUserID);

}
