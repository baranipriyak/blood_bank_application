import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BloodbankSidebarComponent } from './bloodbank-sidebar.component';

describe('BloodbankSidebarComponent', () => {
  let component: BloodbankSidebarComponent;
  let fixture: ComponentFixture<BloodbankSidebarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [BloodbankSidebarComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BloodbankSidebarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
