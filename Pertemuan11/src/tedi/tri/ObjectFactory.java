
package tedi.tri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tedi.tri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddProduct_QNAME = new QName("http://tri.tedi/", "addProduct");
    private final static QName _GetProduct_QNAME = new QName("http://tri.tedi/", "getProduct");
    private final static QName _GetProductResponse_QNAME = new QName("http://tri.tedi/", "getProductResponse");
    private final static QName _GetProducts_QNAME = new QName("http://tri.tedi/", "getProducts");
    private final static QName _AddProductResponse_QNAME = new QName("http://tri.tedi/", "addProductResponse");
    private final static QName _GetProductCategories_QNAME = new QName("http://tri.tedi/", "getProductCategories");
    private final static QName _GetProductCategoriesResponse_QNAME = new QName("http://tri.tedi/", "getProductCategoriesResponse");
    private final static QName _GetProductsResponse_QNAME = new QName("http://tri.tedi/", "getProductsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tedi.tri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProduct }
     * 
     */
    public GetProduct createGetProduct() {
        return new GetProduct();
    }

    /**
     * Create an instance of {@link GetProductResponse }
     * 
     */
    public GetProductResponse createGetProductResponse() {
        return new GetProductResponse();
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link GetProductCategories }
     * 
     */
    public GetProductCategories createGetProductCategories() {
        return new GetProductCategories();
    }

    /**
     * Create an instance of {@link GetProductCategoriesResponse }
     * 
     */
    public GetProductCategoriesResponse createGetProductCategoriesResponse() {
        return new GetProductCategoriesResponse();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link Produk }
     * 
     */
    public Produk createProduk() {
        return new Produk();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tri.tedi/", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tri.tedi/", name = "getProduct")
    public JAXBElement<GetProduct> createGetProduct(GetProduct value) {
        return new JAXBElement<GetProduct>(_GetProduct_QNAME, GetProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tri.tedi/", name = "getProductResponse")
    public JAXBElement<GetProductResponse> createGetProductResponse(GetProductResponse value) {
        return new JAXBElement<GetProductResponse>(_GetProductResponse_QNAME, GetProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tri.tedi/", name = "getProducts")
    public JAXBElement<GetProducts> createGetProducts(GetProducts value) {
        return new JAXBElement<GetProducts>(_GetProducts_QNAME, GetProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tri.tedi/", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tri.tedi/", name = "getProductCategories")
    public JAXBElement<GetProductCategories> createGetProductCategories(GetProductCategories value) {
        return new JAXBElement<GetProductCategories>(_GetProductCategories_QNAME, GetProductCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tri.tedi/", name = "getProductCategoriesResponse")
    public JAXBElement<GetProductCategoriesResponse> createGetProductCategoriesResponse(GetProductCategoriesResponse value) {
        return new JAXBElement<GetProductCategoriesResponse>(_GetProductCategoriesResponse_QNAME, GetProductCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tri.tedi/", name = "getProductsResponse")
    public JAXBElement<GetProductsResponse> createGetProductsResponse(GetProductsResponse value) {
        return new JAXBElement<GetProductsResponse>(_GetProductsResponse_QNAME, GetProductsResponse.class, null, value);
    }

}
