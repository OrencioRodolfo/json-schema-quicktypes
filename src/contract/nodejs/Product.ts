/**
 * A product from Acme's catalog
 */
export interface Product {
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
    /**
     * Coordinates of the warehouse where the product is located.
     */
    warehouseLocation?: LongitudeAndLatitude;
    [property: string]: any;
}

export interface Dimensions {
    height: number;
    length: number;
    width:  number;
    [property: string]: any;
}

/**
 * Coordinates of the warehouse where the product is located.
 *
 * A geographical coordinate on a planet (most commonly Earth).
 */
export interface LongitudeAndLatitude {
    latitude:  number;
    longitude: number;
    [property: string]: any;
}
