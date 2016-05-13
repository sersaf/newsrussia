/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wps.newsrussia.servlets;

import sun.tools.asm.Cover;
import wps.newsrussia.entities.JournalCovers;
import wps.newsrussia.objects.NewsrussiaFacade;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet(name = "ShowImage",
urlPatterns = {"/ShowImage"})
public class ShowImage extends HttpServlet {

//    private static Map<Long, Byte[]> imageMap = new HashMap();
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("image/jpeg");
        OutputStream out = response.getOutputStream();
        try {
            int index = Integer.valueOf(request.getParameter("index"));
            NewsrussiaFacade newsrussiaFacade = (NewsrussiaFacade) getServletContext().getAttribute("newsrussiaFacade");
            JournalCovers image = newsrussiaFacade.getJournals().get(index).getJournalCoversId();
            FileInputStream fis = new FileInputStream(new File(image.getImg()));
            byte[] img = new byte[fis.available()];
            fis.read(img, 0, fis.available());

            response.setContentLength(img.length);
            out.write(img);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            out.close();
        }
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
