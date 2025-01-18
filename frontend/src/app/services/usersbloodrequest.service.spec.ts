import { TestBed } from '@angular/core/testing';

import { UsersbloodrequestService } from './usersbloodrequest.service';

describe('UsersbloodrequestService', () => {
  let service: UsersbloodrequestService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UsersbloodrequestService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
