import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BloodBankLayoutComponent } from './blood-bank-layout.component';

describe('BloodBankLayoutComponent', () => {
  let component: BloodBankLayoutComponent;
  let fixture: ComponentFixture<BloodBankLayoutComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [BloodBankLayoutComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BloodBankLayoutComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
