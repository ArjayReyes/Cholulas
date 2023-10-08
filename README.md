# The Cholulas - CMPE-131-4 

**Team Members**: Arjay Reyes, Ali Altimimi, Ned Zivkovic, Marios Tawdros

**Professor**: Andrew Bond

## Software Engineering I - Project

**Abstract**: Redesigning and recreating a website for the city of [Williamston, Michigan](http://new.williamston-mi.us/). Primarily focused on implementing News Posting and Login modules.

**Dedicated Architecture**: 
* Waterfall Model - since we’re building a project from the ground up, the waterfall model lets us be flexible and is a simple model for us to follow.
* Web Application Architecture - For our project, we chose to use a Model-View-Presenter (MVP) architecture Since most of the website lacks any user input other than the login function, MVP is appropriate, especially for the news posting module.


**Requirements**: 
* News Posting - ability to publish a news post as a website admin.
  * Image posting.
  * Date formatting (DD/MM/YYYY).
  * Up to three news postings shown on the frontpage.
  * Title must not exceed more than fifty words for brevity.
* Login - username and password needed to use certain website functions (currently only news post module).
  * Sign-up and Sign-in.
  * Verify username and password in login.
  * Setup a user-password internal database for the website.
  * Users cannot use certain special characters (?, *, etc.) within username or password.
  * Incorporate a password strength checker; 15+ letters, capitalization, and special characters.

Both modules should also integrate necessary exception handling.
