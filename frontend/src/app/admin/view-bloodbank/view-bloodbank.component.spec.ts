import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewBloodbankComponent } from './view-bloodbank.component';

describe('ViewBloodbankComponent', () => {
  let component: ViewBloodbankComponent;
  let fixture: ComponentFixture<ViewBloodbankComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ViewBloodbankComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewBloodbankComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
