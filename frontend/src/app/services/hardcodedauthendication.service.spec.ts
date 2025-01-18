import { TestBed } from '@angular/core/testing';

import { HardcodedauthendicationService } from './hardcodedauthendication.service';

describe('HardcodedauthendicationService', () => {
  let service: HardcodedauthendicationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HardcodedauthendicationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
