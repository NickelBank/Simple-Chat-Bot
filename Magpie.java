public class Magpie
{
      /**
   * Get a default greeting
       * @return a greeting
       */
  public String getGreeting()
  {
    return "Hello, let's talk.";
  }

      /**
       * Gives a response to a user statement
       *
       * @param statement
       *            the user statement
       * @return a response based on the rules given
       */
  public String getResponse(String statement)
  {
    String response = "";
    if (statement.indexOf("mother") >= 0
        || statement.indexOf("father") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0)
    {
      response = "Tell me more about your family.";
    }
    else if (statement.indexOf("no") >= 0)
    {
      response = "Why so negative?";
    }
    else if (statement.indexOf("dog") >= 0
        || statement.indexOf("cat") >= 0)
    {
        response = "Tell me more about your pets.";
    }
    else if (statement.indexOf("Mrs. Clark") >= 0)
    {
      response = "Mrs. Clark sounds like a good teacher.";
    }
    else if (statement.trim().isEmpty())
    {
      response = "Say something, please";
    }
    else if (statement.indexOf("hungry") >= 0)
    {
      response = "You should eat something.";
    }
    else if (statement.indexOf("movie") >= 0)
    {
      response = "That's a good movie.";
    }
    else if (statement.indexOf("thirsty") >= 0)
    {
      response = "You should go drink some water.";
    }
    else
    {
      response = getRandomResponse();
    }
    return response;
  }

      /**
       * Pick a default response to use if nothing else fits.
       * @return a non-committal string
       */
  private String getRandomResponse()
  {
    final int NUMBER_OF_RESPONSES = 6;
    double r = Math.random();
    int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
    String response = "";

    if (whichResponse == 0)
    {
      response = "Interesting, tell me more.";
    }
    else if (whichResponse == 1)
    {
      response = "Hmmm.";
    }
    else if (whichResponse == 2)
    {
      response = "Do you really think so?";
    }
    else if (whichResponse == 3)
    {
      response = "You don't say.";
    }
    else if (whichResponse == 4)
    {
      response = "That's nice.";
    }
    else if (whichResponse == 5)
    {
      response = "Wow!";
    }
    return response;
  }
}