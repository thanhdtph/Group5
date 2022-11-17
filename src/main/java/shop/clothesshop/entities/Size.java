package shop.clothesshop.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "size")
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sizeid")
    private Integer sizeId;
    @Column(name = "sizecode")
    private String sizeCode;
    @Column(name = "sizedetail")
    private String sizeDetail;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "size")
    @JsonManagedReference
    private List<Product> products;

    public Integer getSizeId() {
        return sizeId;
    }

    public void setSizeId(Integer sizeId) {
        this.sizeId = sizeId;
    }

    public String getSizeCode() {
        return sizeCode;
    }

    public void setSizeCode(String sizeCode) {
        this.sizeCode = sizeCode;
    }

    public String getSizeDetail() {
        return sizeDetail;
    }

    public void setSizeDetail(String sizeDetail) {
        this.sizeDetail = sizeDetail;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
