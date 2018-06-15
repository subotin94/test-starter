interface BrandI {
    id?: number
    name: string
}

export class Brand implements BrandI {
    public id: number
    public name: string

    constructor(brand: BrandI) {
        this.id = brand.id
        this.name = brand.name
    }
}