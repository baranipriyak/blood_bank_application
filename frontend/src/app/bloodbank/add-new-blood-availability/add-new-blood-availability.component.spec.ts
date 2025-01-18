import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddNewBloodAvailabilityComponent } from './add-new-blood-availability.component';

describe('AddNewBloodAvailabilityComponent', () => {
  let component: AddNewBloodAvailabilityComponent;
  let fixture: ComponentFixture<AddNewBloodAvailabilityComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AddNewBloodAvailabilityComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddNewBloodAvailabilityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
