namespace ControlsDesigner
{
    partial class DrawEditor
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.navigation1 = new ControlsDesigner.Panels.Navigation();
            this.SuspendLayout();
            // 
            // navigation1
            // 
            this.navigation1.ButtonSize = 0;
            this.navigation1.Count = 4;
            this.navigation1.Dock = System.Windows.Forms.DockStyle.Top;
            this.navigation1.Location = new System.Drawing.Point(0, 0);
            this.navigation1.Locations = new System.Drawing.Point[] {
        new System.Drawing.Point(0, 0),
        new System.Drawing.Point(0, 0),
        new System.Drawing.Point(0, 0),
        new System.Drawing.Point(0, 0)};
            this.navigation1.Name = "navigation1";
            this.navigation1.Size = new System.Drawing.Size(874, 100);
            this.navigation1.TabIndex = 0;
            this.navigation1.TabStop = true;
            // 
            // DrawEditor
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(874, 561);
            this.Controls.Add(this.navigation1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "DrawEditor";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "DrawEditor";
            this.ResumeLayout(false);

        }




        #endregion

        private Panels.Navigation navigation1;
    }
}