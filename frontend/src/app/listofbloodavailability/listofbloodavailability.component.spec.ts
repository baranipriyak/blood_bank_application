import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListofbloodavailabilityComponent } from './listofbloodavailability.component';

describe('ListofbloodavailabilityComponent', () => {
  let component: ListofbloodavailabilityComponent;
  let fixture: ComponentFixture<ListofbloodavailabilityComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ListofbloodavailabilityComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListofbloodavailabilityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
