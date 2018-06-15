import { TestBed, inject } from '@angular/core/testing';

import { ComponentItemService } from './component-item.service';

describe('ComponentItemService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ComponentItemService]
    });
  });

  it('should be created', inject([ComponentItemService], (service: ComponentItemService) => {
    expect(service).toBeTruthy();
  }));
});
