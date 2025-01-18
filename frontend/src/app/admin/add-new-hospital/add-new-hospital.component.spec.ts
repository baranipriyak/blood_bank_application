import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddNewHospitalComponent } from './add-new-hospital.component';

describe('AddNewHospitalComponent', () => {
  let component: AddNewHospitalComponent;
  let fixture: ComponentFixture<AddNewHospitalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AddNewHospitalComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddNewHospitalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
