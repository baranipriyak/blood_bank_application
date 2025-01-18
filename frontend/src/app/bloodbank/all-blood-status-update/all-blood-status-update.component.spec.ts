import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AllBloodStatusUpdateComponent } from './all-blood-status-update.component';

describe('AllBloodStatusUpdateComponent', () => {
  let component: AllBloodStatusUpdateComponent;
  let fixture: ComponentFixture<AllBloodStatusUpdateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AllBloodStatusUpdateComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AllBloodStatusUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
