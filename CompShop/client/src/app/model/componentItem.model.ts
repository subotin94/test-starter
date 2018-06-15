import { Brand } from "./brand.model"

interface ComponentItemI {
    id?: number
    name: string
    price: number
    brand: Brand
}

export class ComponentItem implements ComponentItemI {
    public id: number
    public name: string
    public price: number
    public brand: Brand

    constructor(item: ComponentItemI) {
        this.id = item.id
        this.name = item.name
        this.price = item.price
        this.brand = item.brand
    }
}