import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewAllBloodRequestComponent } from './view-all-blood-request.component';

describe('ViewAllBloodRequestComponent', () => {
  let component: ViewAllBloodRequestComponent;
  let fixture: ComponentFixture<ViewAllBloodRequestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ViewAllBloodRequestComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewAllBloodRequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
