import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff

    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + intRow*10;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 300 + 3 + intColumn*10; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + 300 + intRow*10;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 300 + 3 + intColumn*10; //Instead of zero, calculate the proper intY location using 'intColumn'

        if (intRow % 2 == 0) // row number = even number to fill black
        {
          fill(0);
        }
        else fill(255);
        
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 600 + 3 + intRow*10;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 300 + 3 + intColumn*10; //Instead of zero, calculate the proper intY location using 'intColumn'

        if (intColumn % 2 == 0) // when the column number is even we color it all black
        {
          fill(0);
        }
        else fill(255); // wheb the column number is odd we color it all white
        
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 900 + 3 + intRow*10; 
        intY = 300 + 3 + intColumn*10; 

        if (intColumn % 2 == 0) // column number is even, color it black
        {
          fill(0);
        }
        else if (intRow % 2 == 1) // row number is odd, we color it black
        {
          fill(0);
        }
        else fill(255); // everything else is white
        
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 30 - intRow; intColumn < 30; intColumn++){ // 30 - intRow to make it work
        intX = 3 + intRow*10; 
        intY = 3 + intColumn*10;
        
        fill (255);

        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  public void draw_section6(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = intRow; intColumn < 30; intColumn++){ // sorta like the inverse of section 5
        intX = 300 + 3 + intRow*10;  
        intY = 3 + intColumn*10; 
      
        fill (255);

        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  public void draw_section7(){
    int intX = 0;
    int intY = 0;

    for(int intColumn = 0; intColumn < 30; intColumn++){
      for(int intRow = 0; intRow < 30 - intColumn; intRow++){ // flip everything around from section 5
        intX = 600 + 3 + intRow*10; 
        intY = 3 + intColumn*10;
        
        fill (255);

        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }
  
  public void draw_section8(){
    int intX = 0;
    int intY = 0;

    for(int intColumn = 0; intColumn < 30; intColumn++){
      for(int intRow = intColumn; intRow < 30; intRow++){ // flip everythin from section 7 around 
        intX = 900 + 3 + intRow*10;  
        intY = 3 + intColumn*10; 
      
        fill (255);

        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }
}