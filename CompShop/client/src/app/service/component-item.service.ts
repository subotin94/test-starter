import { Injectable } from '@angular/core'
import { HttpClient, HttpParams } from '@angular/common/http'
import { Observable } from 'rxjs/Observable';
import { Page } from '../model/page.model';
import { ComponentItem } from '../model/ComponentItem.model';

@Injectable()
export class ComponentItemService {

  private readonly path = '/api/components'

  constructor(private http: HttpClient) {}

  getComponents(page: number): Observable<Page<ComponentItem>> {
    let params = new HttpParams()
    params = params.append('page', page.toString())

    return this.http.get(this.path, {params: params}) as
      Observable<Page<ComponentItem>>
  }

}
