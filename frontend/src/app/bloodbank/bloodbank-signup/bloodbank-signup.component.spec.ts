import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BloodbankSignupComponent } from './bloodbank-signup.component';

describe('BloodbankSignupComponent', () => {
  let component: BloodbankSignupComponent;
  let fixture: ComponentFixture<BloodbankSignupComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [BloodbankSignupComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BloodbankSignupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
