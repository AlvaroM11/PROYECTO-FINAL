import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaMovilComponent } from './lista-movil.component';

describe('ListaMovilComponent', () => {
  let component: ListaMovilComponent;
  let fixture: ComponentFixture<ListaMovilComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListaMovilComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListaMovilComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
