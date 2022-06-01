import { TestBed } from '@angular/core/testing';

import { DocumentariosService } from './documentarios.service';

describe('DocumentariosService', () => {
  let service: DocumentariosService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DocumentariosService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
