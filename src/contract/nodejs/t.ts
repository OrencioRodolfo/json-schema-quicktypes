/**
 * A product from Acme's catalog
 */
export interface T {
    dimensions?: Dimensions;
    /**
     * The price of the product
     */
    price: number;
    /**
     * The unique identifier for a product
     */
    productId: number;
    /**
     * Name of the product
     */
    productName: string;
    /**
     * Tags for the product
     */
    tags?: string[];
    [property: string]: any;
}

export interface Dimensions {
    height: number;
    length: number;
    width:  number;
    [property: string]: any;
}
