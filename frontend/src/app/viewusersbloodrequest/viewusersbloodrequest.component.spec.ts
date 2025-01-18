import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewusersbloodrequestComponent } from './viewusersbloodrequest.component';

describe('ViewusersbloodrequestComponent', () => {
  let component: ViewusersbloodrequestComponent;
  let fixture: ComponentFixture<ViewusersbloodrequestComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ViewusersbloodrequestComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewusersbloodrequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
