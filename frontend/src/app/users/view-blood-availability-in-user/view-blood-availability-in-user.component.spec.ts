import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewBloodAvailabilityInUserComponent } from './view-blood-availability-in-user.component';

describe('ViewBloodAvailabilityInUserComponent', () => {
  let component: ViewBloodAvailabilityInUserComponent;
  let fixture: ComponentFixture<ViewBloodAvailabilityInUserComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ViewBloodAvailabilityInUserComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewBloodAvailabilityInUserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
