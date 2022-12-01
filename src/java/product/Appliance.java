/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "appliance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Appliance.findAll", query = "SELECT a FROM Appliance a")
    , @NamedQuery(name = "Appliance.findByProductid", query = "SELECT a FROM Appliance a WHERE a.productid = :productid")
    , @NamedQuery(name = "Appliance.findByProductname", query = "SELECT a FROM Appliance a WHERE a.productname = :productname")
    , @NamedQuery(name = "Appliance.findByProducttype", query = "SELECT a FROM Appliance a WHERE a.producttype = :producttype")
    , @NamedQuery(name = "Appliance.findByComapnyname", query = "SELECT a FROM Appliance a WHERE a.comapnyname = :comapnyname")
    , @NamedQuery(name = "Appliance.findByProductprice", query = "SELECT a FROM Appliance a WHERE a.productprice = :productprice")
    , @NamedQuery(name = "Appliance.findByDiscountprice", query = "SELECT a FROM Appliance a WHERE a.discountprice = :discountprice")
    , @NamedQuery(name = "Appliance.findByDescription", query = "SELECT a FROM Appliance a WHERE a.description = :description")
    , @NamedQuery(name = "Appliance.findByStockavailable", query = "SELECT a FROM Appliance a WHERE a.stockavailable = :stockavailable")
    , @NamedQuery(name = "Appliance.findByManufacturer", query = "SELECT a FROM Appliance a WHERE a.manufacturer = :manufacturer")
    , @NamedQuery(name = "Appliance.findByProductcode", query = "SELECT a FROM Appliance a WHERE a.productcode = :productcode")})
public class Appliance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "productid")
    private Integer productid;
    @Size(max = 20)
    @Column(name = "productname")
    private String productname;
    @Size(max = 20)
    @Column(name = "producttype")
    private String producttype;
    @Size(max = 20)
    @Column(name = "comapnyname")
    private String comapnyname;
    @Size(max = 20)
    @Column(name = "productprice")
    private String productprice;
    @Size(max = 20)
    @Column(name = "discountprice")
    private String discountprice;
    @Size(max = 80)
    @Column(name = "description")
    private String description;
    @Size(max = 20)
    @Column(name = "stockavailable")
    private String stockavailable;
    @Size(max = 20)
    @Column(name = "manufacturer")
    private String manufacturer;
    @Size(max = 20)
    @Column(name = "productcode")
    private String productcode;

    public Appliance() {
    }

    public Appliance(Integer productid) {
        this.productid = productid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getComapnyname() {
        return comapnyname;
    }

    public void setComapnyname(String comapnyname) {
        this.comapnyname = comapnyname;
    }

    public String getProductprice() {
        return productprice;
    }

    public void setProductprice(String productprice) {
        this.productprice = productprice;
    }

    public String getDiscountprice() {
        return discountprice;
    }

    public void setDiscountprice(String discountprice) {
        this.discountprice = discountprice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStockavailable() {
        return stockavailable;
    }

    public void setStockavailable(String stockavailable) {
        this.stockavailable = stockavailable;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productid != null ? productid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appliance)) {
            return false;
        }
        Appliance other = (Appliance) object;
        if ((this.productid == null && other.productid != null) || (this.productid != null && !this.productid.equals(other.productid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "product.Appliance[ productid=" + productid + " ]";
    }
    
}
