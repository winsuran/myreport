package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<!--[if IE 6]><html class=\"ie6 ie\"><![endif]-->\n");
      out.write("<!--[if IE 7]><html class=\"ie7 ie\"><![endif]-->\n");
      out.write("<!--[if IE 8]><html class=\"ie8 ie\"><![endif]-->\n");
      out.write("<!--[if IE 9]><html class=\"ie9 ieâ><![endif]-->\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>Landing Page</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/jquery.jscrollpane.css\" >\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/main.css\" >\n");
      out.write("<!--[if IE]><style type=\"text/css\">.pie {behavior:url(PIE.htc);}</style><![endif]-->\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery-2.1.4.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/outher/jquery-1.9.1.js\"></script>\n");
      out.write("<script src=\"resources/js/outher/jquery-ui-1.10.4.custom.js\"></script>\n");
      out.write("<script src=\"resources/js/outher/outher/jquery.mousewheel.js\"></script>\n");
      out.write("<script src=\"resources/js/outher/jquery.jscrollpane.min.js\"></script>\n");
      out.write("<script src=\"resources/js/outher/jquery.form-validator.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"resources/js/Signup.js\"></script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("    $( \".toggle1\" ).hide()\n");
      out.write("\t$( \".toggle2\" ).hide()\n");
      out.write("\t$(\"#login\" ).click(function(event) {\n");
      out.write("\t\t event.stopPropagation();\n");
      out.write("         $( \".toggle1\" ).toggle( \"bounce\", { times: 1 }, \"slow\" );\n");
      out.write("\t\t $( \".toggle2\" ).hide()\n");
      out.write("    });\n");
      out.write("  /*   $(\"#signup\" ).click(function(event) {\n");
      out.write("\t\t event.stopPropagation();\n");
      out.write("         $( \".toggle2\" ).toggle( \"bounce\", { times: 1 }, \"slow\" );\n");
      out.write("\t\t $( \".toggle1\" ).hide()\n");
      out.write("    }); */\n");
      out.write("\t/*$(document).click( function(){\n");
      out.write("        $( \".toggle1\" ).hide()\n");
      out.write("\t\t$( \".toggle2\" ).hide()\n");
      out.write("    });*/\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<!--[if lt IE 9]><script src=\"js/respond-1.1.0.min.js\"></script><![endif]-->\n");
      out.write("<!--[if gte IE 9]><style type=\"text/css\">.gradient { filter: none; }</style>\n");
      out.write("<![endif]-->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"outer\">\n");
      out.write("<header>\n");
      out.write("  <div class=\"headerBack\">\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("      <header> \n");
      out.write("      \t<div class=\"logo\">&nbsp;</div> \n");
      out.write("        <button class=\"loginBtn\" id=\"login\" name=\"login\">Login</button>\n");
      out.write("        <div class=\"toggle1\">\n");
      out.write("        <form>\n");
      out.write("        \t<input type=\"text\" id=\"email\" name=\"email\" placeholder=\"email\" required>\n");
      out.write("            <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"password\" required>\n");
      out.write("            <div class=\"width100P\"><a class=\"forgotPassword\"><em>forgot password</em></a></div>\n");
      out.write("            <input type=\"checkbox\" id=\"rememberPassword\" name=\"rememberPassword\">Remember me\n");
      out.write("            <button class=\"formLoginBtn\" id=\"loginBtn\" name=\"loginBtn\">Login</button>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clear\">&nbsp;</div>\n");
      out.write("      </header>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"clear\">&nbsp;</div>\n");
      out.write("</header>\n");
      out.write("<section class=\"content\">\n");
      out.write("  <div class=\"wrapper\">\n");
      out.write("    <div class=\"mobile\">&nbsp;</div>\n");
      out.write("    <div class=\"mainTxtBox\">\n");
      out.write("    \t<h2>Revision Made Easy...!!!</h2>\n");
      out.write("        <button class=\"signupBtn\" id=\"signup\" name=\"signup\">Sign Up Now</button>\n");
      out.write("        <div class=\"toggle2\">\n");
      out.write("        <form>\n");
      out.write("        \t<input type=\"text\" id=\"first_name\" name=\"first_name\" placeholder=\"first name\" required>\n");
      out.write("            <input type=\"text\" id=\"last_name\" name=\"last_name\" placeholder=\"last name\" required> \n");
      out.write("                 \n");
      out.write("            <input name=\"gender\" type=\"radio\" value=\"male\"  id=\"male\" checked><label for=\"male\">Male</label>\n");
      out.write("            <input name=\"gender\" type=\"radio\" value=\"female\" id=\"female\"><label for=\"female\">Female</label>\n");
      out.write("            \n");
      out.write("            <input type=\"text\" id=\"email\" name=\"email\" placeholder=\"email\" required>\n");
      out.write("            <input type=\"password\" id=\"password\" name=\"password\" placeholder=\"password\" required>\n");
      out.write("            <input type=\"password\" id=\"confirmation_password\" name=\"confirmation_password\" placeholder=\"re-enter password\" required>\n");
      out.write("            <button class=\"formSignUpBtn\" id=\"SignUpBtn\" name=\"SignUpBtn\">Sign Up</button>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("    \t<p>\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\"</p>\n");
      out.write("        <div class=\"clear\">&nbsp;</div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"dwnldBtns\">\n");
      out.write("    \t<a class=\"google\" href=\"#\">&nbsp;</a>\n");
      out.write("        <a class=\"apple\" href=\"#\">&nbsp;</a>  \n");
      out.write("    </div>\n");
      out.write("  <div class=\"clear\">&nbsp;</div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"wrapper\">\n");
      out.write("  \t<p class=\"whatIs\">WHAT IS </p>\n");
      out.write("  \t<div class=\"logo logo2\">&nbsp;</div> \n");
      out.write("    \n");
      out.write("    <video width=\"470\" height=\"255\" poster=\"images/video.jpg\" controls>\n");
      out.write("      <source src=\"video.mp4\" type=\"video/mp4\">\n");
      out.write("      <source src=\"video.ogg\" type=\"video/ogg\">\n");
      out.write("      <source src=\"video.webm\" type=\"video/webm\">\n");
      out.write("      <object data=\"video.mp4\" width=\"470\" height=\"255\">\n");
      out.write("      <embed src=\"video.swf\" width=\"470\" height=\"255\">\n");
      out.write("      </object>\n");
      out.write("    </video>\n");
      out.write("    \n");
      out.write("    <article class=\"schedule\">\n");
      out.write("    \t<h3>Lorem Ipsum</h3>\n");
      out.write("        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip.</p>\n");
      out.write("    </article>\n");
      out.write("    <article class=\"edit\">\n");
      out.write("    \t<h3>Lorem Ipsum</h3>\n");
      out.write("        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip.</p>\n");
      out.write("    </article>\n");
      out.write("    <article class=\"alarm\">\n");
      out.write("    \t<h3>Lorem Ipsum</h3>\n");
      out.write("        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip.</p>\n");
      out.write("    </article>    \n");
      out.write("    <article class=\"note\">\n");
      out.write("    \t<h3>Lorem Ipsum</h3>\n");
      out.write("        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip.</p>\n");
      out.write("    </article>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  \n");
      out.write("  <div class=\"clear\">&nbsp;</div>\n");
      out.write("  </div>\n");
      out.write(" </section>\n");
      out.write("<footer>\n");
      out.write("  <p>Powered by : <span>Worldwide Technology Services</span></p>\n");
      out.write("</footer>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
