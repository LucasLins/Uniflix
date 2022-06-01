import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EpisodiosDialogComponent } from './episodios-dialog.component';

describe('EpisodiosDialogComponent', () => {
  let component: EpisodiosDialogComponent;
  let fixture: ComponentFixture<EpisodiosDialogComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EpisodiosDialogComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EpisodiosDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
