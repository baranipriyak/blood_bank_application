import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddbloodavailabilityComponent } from './addbloodavailability.component';

describe('AddbloodavailabilityComponent', () => {
  let component: AddbloodavailabilityComponent;
  let fixture: ComponentFixture<AddbloodavailabilityComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AddbloodavailabilityComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddbloodavailabilityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
