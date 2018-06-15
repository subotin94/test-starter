import { Component, OnInit } from '@angular/core'
import { ComponentItemService } from '../../service/component-item.service'
import { Page } from '../../model/page.model'
import { ComponentItem } from '../../model/ComponentItem.model'

@Component({
  selector: 'app-items',
  templateUrl: './items.component.html',
  styleUrls: ['./items.component.css']
})
export class ItemsComponent implements OnInit {

  currentPageNumber: number
  page: Page<ComponentItem>

  constructor(private service: ComponentItemService) {}

  ngOnInit() {
    this.currentPageNumber = 0
    this.loadData()
  }

  loadData() {
    this.service.getComponents(this.currentPageNumber)
      .subscribe(data => {
        this.page = data
      })
  }

  addToCart(id: number) {
    console.log('add works!' +id)
  }

  changePage(i: number) {
  	this.currentPageNumber += i
  	this.loadData()
  }

}
