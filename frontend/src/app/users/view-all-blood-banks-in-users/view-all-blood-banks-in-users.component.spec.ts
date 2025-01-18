import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewAllBloodBanksInUsersComponent } from './view-all-blood-banks-in-users.component';

describe('ViewAllBloodBanksInUsersComponent', () => {
  let component: ViewAllBloodBanksInUsersComponent;
  let fixture: ComponentFixture<ViewAllBloodBanksInUsersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ViewAllBloodBanksInUsersComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewAllBloodBanksInUsersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
