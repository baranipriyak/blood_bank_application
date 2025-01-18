import { TestBed } from '@angular/core/testing';

import { BloodavailabilityService } from './bloodavailability.service';

describe('BloodavailabilityService', () => {
  let service: BloodavailabilityService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BloodavailabilityService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
